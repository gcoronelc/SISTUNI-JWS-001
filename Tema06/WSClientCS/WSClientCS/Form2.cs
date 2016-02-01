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
    }
}
