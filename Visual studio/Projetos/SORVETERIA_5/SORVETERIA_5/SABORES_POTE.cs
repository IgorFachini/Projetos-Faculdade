using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SORVETERIA_5 {
    public partial class SABORES_POTE : Form {
        public SABORES_POTE() {
        }

        public SABORES_POTE(double valor) {
            InitializeComponent();
            this.valorRecipiente = valor;
        }
        String recipiente = "Pote"; 
        double valorRecipiente;

        private void Form3_Load(object sender, EventArgs e) {

        }

        private void label1_Click(object sender, EventArgs e) {

        }

        private void label3_Click(object sender, EventArgs e) {

        }

        private void pronto_Click(object sender, EventArgs e) {
            double contador = 0;
            String sabores = "";
            if (morango.Checked) {
                contador += 1.2;
                sabores = (sabores + "\nMorango");
            }
            if (baunilha.Checked) {
                contador += 1;
                sabores = (sabores + "\nBaunilha");
            }
            if (limao.Checked) {
                contador += 1.5;
                sabores = (sabores + "\nLimao");
            }
            if (flocos.Checked) {
                contador += 1;
                sabores = (sabores + "\nflocos");
            }
            if (chicletes.Checked) {
                contador += 1.5;
                sabores = (sabores + "\nChicletes");
            }
            if (chocolatee.Checked) {
                contador += 1.3;
                sabores = (sabores + "\nChocolate");
            }
            if (contador == 0) {
                MessageBox.Show("SELECIONE AO MENOS UM SABOR!");
            } else {
                COMPLEMENTO complemento = new COMPLEMENTO(recipiente, valorRecipiente, sabores, contador);
                this.Hide();
                complemento.Show();
            }
        }

        private void morango_CheckedChanged(object sender, EventArgs e) {

        }

        private void label4_Click(object sender, EventArgs e) {

        }

        private void label6_Click(object sender, EventArgs e) {

        }

        private void label8_Click(object sender, EventArgs e) {

        }
    }
}
