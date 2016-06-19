namespace SORVETERIA_5 {
    partial class TOTAL {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing) {
            if (disposing && (components != null)) {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent() {
            this.texto = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.resultado = new System.Windows.Forms.Label();
            this.confirmar = new System.Windows.Forms.Button();
            this.cancelar = new System.Windows.Forms.Button();
            this.sair = new System.Windows.Forms.Button();
            this.nomeUser = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // texto
            // 
            this.texto.AutoSize = true;
            this.texto.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.texto.Location = new System.Drawing.Point(12, 56);
            this.texto.Name = "texto";
            this.texto.Size = new System.Drawing.Size(45, 18);
            this.texto.TabIndex = 0;
            this.texto.Text = "texto";
            this.texto.Click += new System.EventHandler(this.texto_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(154, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(97, 29);
            this.label1.TabIndex = 1;
            this.label1.Text = "TOTAL";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(12, 333);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(391, 29);
            this.label2.TabIndex = 2;
            this.label2.Text = "___________________________";
            
            // 
            // resultado
            // 
            this.resultado.AutoSize = true;
            this.resultado.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.resultado.Location = new System.Drawing.Point(13, 373);
            this.resultado.Name = "resultado";
            this.resultado.Size = new System.Drawing.Size(45, 20);
            this.resultado.TabIndex = 4;
            this.resultado.Text = "total";
            // 
            // confirmar
            // 
            this.confirmar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold);
            this.confirmar.Location = new System.Drawing.Point(151, 368);
            this.confirmar.Name = "confirmar";
            this.confirmar.Size = new System.Drawing.Size(125, 31);
            this.confirmar.TabIndex = 5;
            this.confirmar.Text = "CONFIRMAR";
            this.confirmar.UseVisualStyleBackColor = true;
            // 
            // cancelar
            // 
            this.cancelar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold);
            this.cancelar.Location = new System.Drawing.Point(282, 368);
            this.cancelar.Name = "cancelar";
            this.cancelar.Size = new System.Drawing.Size(121, 31);
            this.cancelar.TabIndex = 6;
            this.cancelar.Text = "CANCELAR";
            this.cancelar.UseVisualStyleBackColor = true;
            this.cancelar.Click += new System.EventHandler(this.cancelar_Click);
            // 
            // sair
            // 
            this.sair.Location = new System.Drawing.Point(372, 14);
            this.sair.Name = "sair";
            this.sair.Size = new System.Drawing.Size(45, 26);
            this.sair.TabIndex = 16;
            this.sair.Text = "Sair";
            this.sair.UseVisualStyleBackColor = true;
            this.sair.Click += new System.EventHandler(this.sair_Click);
            // 
            // nomeUser
            // 
            this.nomeUser.AutoSize = true;
            this.nomeUser.Location = new System.Drawing.Point(360, -2);
            this.nomeUser.Name = "nomeUser";
            this.nomeUser.Size = new System.Drawing.Size(35, 13);
            this.nomeUser.TabIndex = 15;
            this.nomeUser.Text = "label9";
            // 
            // TOTAL
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(419, 408);
            this.Controls.Add(this.sair);
            this.Controls.Add(this.nomeUser);
            this.Controls.Add(this.cancelar);
            this.Controls.Add(this.confirmar);
            this.Controls.Add(this.resultado);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.texto);
            this.Name = "TOTAL";
            this.Text = "TOTAL";
            this.Load += new System.EventHandler(this.TOTAL_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label texto;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label resultado;
        private System.Windows.Forms.Button confirmar;
        private System.Windows.Forms.Button cancelar;
        private System.Windows.Forms.Button sair;
        private System.Windows.Forms.Label nomeUser;
    }
}