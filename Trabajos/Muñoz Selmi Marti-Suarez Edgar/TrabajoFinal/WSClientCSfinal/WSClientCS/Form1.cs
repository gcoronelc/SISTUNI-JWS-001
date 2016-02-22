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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnProcesar_Click(object sender, EventArgs e)
        {
            // Datos
            int num1 = int.Parse(txtNum1.Text);
            int num2 = int.Parse(txtNum2.Text);
            // Proceso
            WSClientCS.wsmath.WSMath service;
            service = new WSClientCS.wsmath.WSMath();
            int suma = service.sumar(num1, num2);
            int resta = service.restar(num1, num2);
            // Reporte
            lblSuma.Text = "" + num1 + " + " + num2 + " = " + suma;
            lblResta.Text = "" + num1 + " - " + num2 + " = " + resta;
        }
    }
}
