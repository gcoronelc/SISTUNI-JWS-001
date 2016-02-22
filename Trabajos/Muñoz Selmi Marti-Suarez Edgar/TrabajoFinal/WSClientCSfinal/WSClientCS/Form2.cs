using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WSClientCS
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void btnProcesar_Click(object sender, EventArgs e)
        {
            WSClientCS.wsmath.WSMath service = new WSClientCS.wsmath.WSMath();
            WSClientCS.wsmath.clienteModel[] data;
            data = service.getClientes(txtNombre.Text);
            dataGridView1.DataSource = data;
        }
        
        void cargar()
        {
           WSClientCS.wsmath.WSMath service = new WSClientCS.wsmath.WSMath();
           WSClientCS.wsmath.clienteModel[] data;
           data = service.getClientesAll();
           dataGridView1.DataSource = data;
           lblitems.Text= "Items Listados = "+dataGridView1.RowCount.ToString();
           t1.Text = (dataGridView1.RowCount+1).ToString().PadLeft(5, '0');
           t1.Enabled = false;
        }

        void limpiar() 
        {
            t2.Text = "";
            t3.Text = "";
            t4.Text = "";
            t5.Text = "";
            t6.Text = "";
            t7.Text = "";
            t8.Text = "";
            t9.Text = "";
            t2.Focus();
        }
         
        private void Form2_Load(object sender, EventArgs e)
        {
            cargar();
        }

        private void btn_guardar_Click(object sender, EventArgs e)
        {
            WSClientCS.wsmath.WSMath service = new WSClientCS.wsmath.WSMath();
            WSClientCS.wsmath.clienteModel[] data;
            string msg = (service.Registrar(t1.Text, t2.Text, t3.Text, t4.Text, t5.Text, t6.Text, t7.Text, t8.Text, t9.Text));
            lblmsg.Text = msg.ToString();
            cargar();
            limpiar();
        }

        private void btn_modificar_Click(object sender, EventArgs e)
        {
            WSClientCS.wsmath.WSMath service = new WSClientCS.wsmath.WSMath();
            WSClientCS.wsmath.clienteModel[] data;
            string msg=service.Actualizar(t1.Text, t2.Text, t3.Text, t4.Text, t5.Text, t6.Text, t7.Text, t8.Text);
            lblmsg.Text = msg.ToString();
            cargar();
        }

        private void btn_eliminar_Click(object sender, EventArgs e)
        {
            WSClientCS.wsmath.WSMath service = new WSClientCS.wsmath.WSMath();
            WSClientCS.wsmath.clienteModel[] data;
            string msg = service.Eliminar(t5.Text);
            lblmsg.Text = msg.ToString();
            cargar();
        }

        private void btn_limpiar_Click(object sender, EventArgs e)
        {
            limpiar();        
        }
    }
}
