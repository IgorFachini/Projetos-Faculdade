using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sorveteria
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            Sorvete s = new Sorvete();

            MessageBox.Show(s.Preco+s.Nome);


            SorveteComCobertura c;
            c = new SorveteComCobertura(s);

            TesteCobertura d;
            d = new TesteCobertura(c);

            SorveteComCobertura x;
            x = new SorveteComCobertura(d);

            MessageBox.Show(x.Preco + x.Nome);


        }

        private void Form1_Load(object sender, EventArgs e) {

        }

        private void textBox1_TextChanged(object sender, EventArgs e) {

        }
    }
}
