using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sorveteria {
    class SorveteComCobertura : ISorvete {
        //Component : IComponent
        ISorvete s;


        public SorveteComCobertura(ISorvete s) {
            this.s = s;
        }


        //State
        public double Preco {
            get {
                return this.s.Preco + 2;
            }
        }
    }
}
