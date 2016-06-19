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
    public partial class 
        SABORES_CASQUINHA : Form {
        public SABORES_CASQUINHA() {
            InitializeComponent();
        }

        public SABORES_CASQUINHA(String casquinha, double valorCasquinha) {
            InitializeComponent();
            this.casquinha = casquinha;
            this.valorCasquinha = valorCasquinha;
        }

        String casquinha;
        double valorCasquinha;

        private void chocolate_Click(object sender, EventArgs e) {

        }

        private void baunilha_Click(object sender, EventArgs e) {

        }

        private void misto_Click(object sender, EventArgs e) {

        }

        private void SABORES_CASQUINHA_Load(object sender, EventArgs e) {

        }

        private void label8_Click(object sender, EventArgs e) {

        }
    }
}
