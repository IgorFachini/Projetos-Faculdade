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
    public partial class COMPLEMENTO : Form {
        public COMPLEMENTO() {
            InitializeComponent();
        }

        public COMPLEMENTO(String recipiente, double valorRecipiente, String sabor, double valorSabor) {
            InitializeComponent();
            this.recipiente = recipiente;
            this.sabor = sabor;
            this.valorRecipiente = valorRecipiente;
            this.valorSabor = valorSabor;
        }

        String recipiente;
        String sabor;
        double valorRecipiente;
        double valorSabor;

        private void button2_Click(object sender, EventArgs e) {

        }

        private void COMPLEMENTO_Load(object sender, EventArgs e) {

        }

        private void pronto_Click(object sender, EventArgs e) {
            double contador = 0;
            String adicionais = "";
            if (balinhas.Checked) {
                contador += 1.2;
                adicionais = (adicionais + "\n+ Balinhas");
            }
            if (cobertura.Checked) {
                contador += 1;
                adicionais = (adicionais + "\n+ Cobertura");
            }
            if (granulados.Checked) {
                contador += 1.5;
                adicionais = (adicionais + "\n+ Granulados");
            }
            if (tubetes.Checked) {
                contador += 1;
                adicionais = (adicionais + "\n+ Tubetes");
            }
        }
    }
}
