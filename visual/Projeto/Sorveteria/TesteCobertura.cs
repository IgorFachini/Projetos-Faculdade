using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sorveteria {
    class TesteCobertura : ISorvete {
        //Component : IComponent
        ISorvete s;


        public TesteCobertura(ISorvete s) {
            this.s = s;
            MessageBox.Show("Add Morango!+2");
        }

        public string Nome {
            get {
                return this.s.Nome + " ADD Morango!";
            }
        }


        //State
        public double Preco {
            get {
                return this.s.Preco + 2;
            }
        }
    }
}
