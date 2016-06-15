using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace Sorveteria {
    public partial class MontagemSorvete : Form {
        public MontagemSorvete() {
            InitializeComponent();
        }


        private void chocolate_Click(object sender, EventArgs e) {
            chocolate.ForeColor = System.Drawing.Color.White;

        }

        private void morango_Click(object sender, EventArgs e) {
            morango.ForeColor = System.Drawing.Color.White;
        }

        private void baunilha_Click(object sender, EventArgs e) {
            baunilha.ForeColor = System.Drawing.Color.White;
        }

        private void napolitano_Click(object sender, EventArgs e) {
            coco.ForeColor = System.Drawing.Color.White;
        }

        private void cobertura_Click(object sender, EventArgs e) {
            cobertura.ForeColor = System.Drawing.Color.White;
        }

        private void granulado_Click(object sender, EventArgs e) {
            granulado.ForeColor = System.Drawing.Color.White;
        }

        private void balinhas_Click(object sender, EventArgs e) {
            balinhas.ForeColor = System.Drawing.Color.White;
        }

        private void canudo_Click(object sender, EventArgs e) {
            canudo.ForeColor = System.Drawing.Color.White;
        }

        private void coco_Click(object sender, EventArgs e) {

        }
    }
}
