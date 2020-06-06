using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;

namespace CamadaDeDados
{
   public class Dcategoria
    {
        private int _IDcategoria;
        private string _nome;
        private string _descricao;
        private string _TextoBusca;

        public Dcategoria()
        {
        }

        public Dcategoria(int dcategoria, string nome, string descricao, string textoBusca)
        {
            this.IDcategoria = dcategoria;
            this.Nome = nome;
            this.Descricao = descricao;
            this.TextoBusca = textoBusca;
        }

        public int IDcategoria { get => _IDcategoria; set => _IDcategoria = value; }
        public string Nome { get => _nome; set => _nome = value; }
        public string Descricao { get => _descricao; set => _descricao = value; }
        public string TextoBusca { get => _TextoBusca; set => _TextoBusca = value; }

        public string inserirCategoria(Dcategoria categoria)
        {
            string resp = "";
            SqlConnection sqlConnection=new SqlConnection(); 

            try
            {
                sqlConnection.ConnectionString = Conexao.Cm;
                sqlConnection.Open();

                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = sqlConnection;
                sqlCommand.CommandText = "spInserir_categoria";
                sqlCommand.CommandType = CommandType.StoredProcedure;

                SqlParameter sqlParameterCategoria = new SqlParameter();
                sqlParameterCategoria.ParameterName = "@idCategoria";
                sqlParameterCategoria.SqlDbType = SqlDbType.Int;
                sqlParameterCategoria.Direction = ParameterDirection.Output;
                sqlCommand.Parameters.Add(sqlParameterCategoria);

                SqlParameter sqlParameterNome = new SqlParameter();
                sqlParameterNome.ParameterName = "@nome";
                sqlParameterNome.SqlDbType = SqlDbType.VarChar;
                sqlParameterNome.Size = 50;
                sqlParameterNome.Value = categoria.Nome;
                sqlCommand.Parameters.Add(sqlParameterNome);

                SqlParameter sqlParameterDescricao = new SqlParameter();
                sqlParameterDescricao.ParameterName = "@descricao";
                sqlParameterDescricao.SqlDbType = SqlDbType.VarChar;
                sqlParameterDescricao.Size = 256;
                sqlParameterDescricao.Value = categoria.Descricao;
                sqlCommand.Parameters.Add(sqlParameterDescricao);

                resp = (sqlCommand.ExecuteNonQuery() == 1) ? "OK" : "o registro nao foi inserido!!!"; 

            }
            catch(Exception ex)
            {
                resp = ex.Message;
            }
            finally // sempre execulta a linha 
            {
                if(sqlConnection.State == ConnectionState.Open)
                {
                    sqlConnection.Close();
                }
            }
            return resp;
            
        }

        public string editarCategoria(Dcategoria categoria)
        {
            string resp = "";
            SqlConnection sqlConnection = new SqlConnection();

            try
            {
                sqlConnection.ConnectionString = Conexao.Cm;
                sqlConnection.Open();

                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = sqlConnection;
                sqlCommand.CommandText = "spEditar_categoria";
                sqlCommand.CommandType = CommandType.StoredProcedure;

                SqlParameter sqlParameterCategoria = new SqlParameter();
                sqlParameterCategoria.ParameterName = "@idCategoria";
                sqlParameterCategoria.SqlDbType = SqlDbType.Int;
                sqlParameterCategoria.Value = categoria.IDcategoria;
                sqlCommand.Parameters.Add(sqlParameterCategoria);

                SqlParameter sqlParameterNome = new SqlParameter();
                sqlParameterNome.ParameterName = "@nome";
                sqlParameterNome.SqlDbType = SqlDbType.VarChar;
                sqlParameterNome.Size = 50;
                sqlParameterNome.Value = categoria.Nome;
                sqlCommand.Parameters.Add(sqlParameterNome);

                SqlParameter sqlParameterDescricao = new SqlParameter();
                sqlParameterNome.ParameterName = "@descricao";
                sqlParameterNome.SqlDbType = SqlDbType.VarChar;
                sqlParameterNome.Size = 256;
                sqlParameterNome.Value = categoria.Descricao;
                sqlCommand.Parameters.Add(sqlParameterDescricao);

                resp = (sqlCommand.ExecuteNonQuery() == 1) ? "OK" : "Ediçao nao realizada";

            }
            catch (Exception ex)
            {
                resp = ex.Message;
            }
            finally // sempre execulta a linha 
            {
                if (sqlConnection.State == ConnectionState.Open)
                {
                    sqlConnection.Close();
                }
            }
            return resp;

        }
        public string excluirCategoria(Dcategoria categoria)
        {
            string resp = "";
            SqlConnection sqlConnection = new SqlConnection();

            try
            {
                sqlConnection.ConnectionString = Conexao.Cm;
                sqlConnection.Open();

                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = sqlConnection;
                sqlCommand.CommandText = "spDeletar_categoria";
                sqlCommand.CommandType = CommandType.StoredProcedure;

                SqlParameter sqlParameterCategoria = new SqlParameter();
                sqlParameterCategoria.ParameterName = "@idCategoria";
                sqlParameterCategoria.SqlDbType = SqlDbType.Int;
                sqlParameterCategoria.Value = categoria.IDcategoria;
                sqlCommand.Parameters.Add(sqlParameterCategoria);
                //SqlCommand sqlCommand = new SqlCommand();
                //sqlCommand.Connection = sqlConnection;
                //sqlCommand.CommandText = "DELETE FROM CATEGORIA WHERE idcategoria = @idCategoria";
                //sqlCommand.CommandType = CommandType.Text;


                resp = (sqlCommand.ExecuteNonQuery() == 1) ? "OK" : "Deletar nao realizada";

            }
            catch (Exception ex)
            {
                resp = ex.Message;
            }
            finally // sempre execulta a linha 
            {
                if (sqlConnection.State == ConnectionState.Open)
                {
                    sqlConnection.Close();
                }
            }
            return resp;
        }

        public DataTable mostraCategoria()
        {
            DataTable DtResultado = new DataTable("Categoria");
            SqlConnection sqlConnection = new SqlConnection();
            
            try
            {
                sqlConnection.ConnectionString = Conexao.Cm;
                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = sqlConnection;
                sqlCommand.CommandText = "spmostra_categoria";
                sqlCommand.CommandType = CommandType.StoredProcedure;

                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);//para exibir as informaçao
                sqlDataAdapter.Fill(DtResultado);
            }
            catch(Exception ex)
            {
                DtResultado = null; 
            }
            
            return DtResultado;
        }

        public DataTable buscarNome(Dcategoria categoria)
        {
            DataTable DtResultado = new DataTable("Categoria");
            SqlConnection sqlConnection = new SqlConnection();
            try
            {
                sqlConnection.ConnectionString = Conexao.Cm;
                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = sqlConnection;
                sqlCommand.CommandText = "spBuscar_nome";
                sqlCommand.CommandType = CommandType.StoredProcedure;
               

                SqlParameter sqlParameterBuscar = new SqlParameter();
                sqlParameterBuscar.ParameterName = "@textobuscar";
                sqlParameterBuscar.SqlDbType = SqlDbType.VarChar;
                sqlParameterBuscar.Size = 50;
                sqlParameterBuscar.Value = categoria.TextoBusca;
                sqlCommand.Parameters.Add(sqlParameterBuscar);

                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);//para exibir as informaçao
                sqlDataAdapter.Fill(DtResultado);
            }
            catch (Exception ex)
            {
                DtResultado = null;
            }
            return DtResultado;
        }
    }
}
