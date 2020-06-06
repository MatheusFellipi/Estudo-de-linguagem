using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using CamadaDeNegocio;

namespace CamadeDeApresentacao
{
    public partial class frmCategoria : Form
    {
        private bool eNovo = false;
        private bool eEditar = false;
        public frmCategoria()
        {
            InitializeComponent();
            this.TipMenssagem.SetToolTip(this.txtNome, "Inseri o nome da categoria");

        }
        private  void messagemOk(string message)
        {
            MessageBox.Show(message, "Sistema comercio", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }
        private void messagemErro(string message)
        {
            MessageBox.Show(message, "Sistema comercio", MessageBoxButtons.OK, MessageBoxIcon.Error);
        }
        private void limpar()
        {
            this.txtNome.Text = string.Empty;
            this.txtDescricao.Text = string.Empty;
            this.txtCategoria.Text = string.Empty;
        }
        private void habilitarTexBox(bool valor)
        {

            this.txtNome.ReadOnly = !valor;
            this.txtDescricao.ReadOnly = !valor;
            this.txtCategoria.ReadOnly = !valor;
        }
        private void buttoes()
        {
            if (this.eNovo == true || this.eEditar == true)
            {
                this.habilitarTexBox(true);
                this.btnNovo.Enabled = false;
                this.BtnSalvar.Enabled = true;
                this.btnEditar.Enabled = false;
                this.btnCancelar.Enabled = true;
            }
            else
            {
                this.habilitarTexBox(false);
                this.btnNovo.Enabled = true;
                this.BtnSalvar.Enabled = false;
                this.btnEditar.Enabled = true;
                this.btnCancelar.Enabled = false;
            }
        }

        private void ocultarColunas()
        {
            this.dataLista.Columns[0].Visible = false;
            //this.dataLista.Columns[1].Visible = false;
        }
        private void mostra()
        {
            this.dataLista.DataSource = Ncategoria.mostraCategoria();
            this.ocultarColunas();
            Lbltotal.Text = "total de registro: "+Convert.ToString(dataLista.Rows.Count);
        }
        private void buscarNome()
        {
            this.dataLista.DataSource = Ncategoria.buscarNome(this.txtBuscar.Text);
            this.ocultarColunas();
            Lbltotal.Text = "total de registro: " + Convert.ToString(dataLista.Rows.Count);
        }
        private void FrmCategoria_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'praticaCshapDataSet1.Categoria' table. You can move, or remove it, as needed.
            this.categoriaTableAdapter.Fill(this.praticaCshapDataSet1.Categoria);
            // TODO: This line of code loads data into the 'praticaCshapDataSet1.Categoria' table. You can move, or remove it, as needed.
            this.categoriaTableAdapter.Fill(this.praticaCshapDataSet1.Categoria);
            this.Top = 0;
            this.Left = 0;
            this.mostra();
            this.habilitarTexBox(false);
            this.buttoes();

        }

        private void BtnBuscar_Click(object sender, EventArgs e)
        {
            this.buscarNome();
        }

        private void TxtBuscar_TextChanged(object sender, EventArgs e)
        {
            this.buscarNome();
        }

        private void BtnNovo_Click(object sender, EventArgs e)
        {
            this.eNovo = true;
            this.eEditar = false;
            this.buttoes();
            this.limpar();
            this.habilitarTexBox(true);
            this.txtNome.Focus();
            this.txtCategoria.Enabled = false;

        }

        private void BtnSalvar_Click(object sender, EventArgs e)
        {
            try
            {
                string resp = "";

                if(this.txtNome.Text==string.Empty)
                {
                    messagemErro("preecha todos os nome");
                    this.errorIcon.SetError(txtNome,"inseri o nome");
                }
                else
                {
                    if(this.eNovo)
                    {
                        resp = Ncategoria.inserir(this.txtNome.Text.Trim().ToUpper(), this.txtDescricao.Text.Trim().ToUpper());
                    }
                    else
                    {
                        resp = Ncategoria.editar(Convert.ToInt32(this.txtCategoria.Text),this.txtNome.Text.Trim().ToUpper(),
                            this.txtDescricao.Text.Trim().ToUpper());
                    }

                    if (resp.Equals("OK"))
                    {
                        if(this.eNovo)
                        {
                            this.messagemOk("registro salvo");
                        }
                        else
                        {
                            this.messagemOk("editado salvo");
                        }
                    }
                    else
                    {
                        this.messagemErro(resp);
                       
                    }
                    this.eNovo = false;
                    this.eEditar = false;
                    this.buttoes();
                    this.limpar();
                    this.mostra();
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message + ex.StackTrace);
            }
        }

        private void DataLista_DoubleClick(object sender, EventArgs e)
        {
            this.txtCategoria.Text = Convert.ToString(this.dataLista.CurrentRow.Cells[1].Value);
            this.txtNome.Text = Convert.ToString(this.dataLista.CurrentRow.Cells[2].Value);
            this.txtDescricao.Text = Convert.ToString(this.dataLista.CurrentRow.Cells[3].Value);
            this.tabControl1.SelectedIndex = 1;
        }

        private void BtnEditar_Click(object sender, EventArgs e)
        {
            if(this.txtCategoria.Text.Equals(""))
            {
                this.messagemErro("selecione uma registro para inserir");
            }
            else
            {
                this.eEditar = true;
                this.buttoes();
                this.habilitarTexBox(true);
            }
        }

        private void BtnCancelar_Click(object sender, EventArgs e)
        {
            this.eNovo = false;
            this.eEditar = false;
            this.buttoes();
            this.habilitarTexBox(false);
            this.limpar();

        }

        private void ChkDeletar_CheckedChanged(object sender, EventArgs e)
        {
            
            if(this.chkDeletar.Checked)
            {
                this.dataLista.Columns[0].Visible=true;
            }
            else
            {
                this.dataLista.Columns[0].Visible = false;
            }
        }

        private void DataLista_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.ColumnIndex == dataLista.Columns["deletar"].Index)
            {
                DataGridViewCheckBoxCell checkBoxCell = (DataGridViewCheckBoxCell)dataLista.Rows[e.RowIndex].Cells["deletar"];
                checkBoxCell.Value = !Convert.ToBoolean(checkBoxCell.Value);

            }
        }

        private void BtnDeletar_Click(object sender, EventArgs e)
        {
            try
            {
                DialogResult opcao;
                opcao = MessageBox.Show("vc deseja apagar os registros??", "sitema cormercio", MessageBoxButtons.OKCancel,MessageBoxIcon.Question);
                if(opcao== DialogResult.OK)
                {
                    string codigo;
                    string resp = "";

                    foreach(DataGridViewRow row in dataLista.Rows)
                    {
                        if (Convert.ToBoolean(row.Cells[0].Value))
                        {
                            codigo = Convert.ToString(row.Cells[1].Value);
                            resp = Ncategoria.deletar(Convert.ToInt32(codigo));
                            if (resp.Equals("OK"))
                            {
                                this.messagemOk("registro excluido");
                            }
                            else
                            {
                                this.messagemErro(resp);
                            }
                             
                        }
                            
                    }
                    this.mostra();
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message + ex.StackTrace);
            }
        }
    }
}
