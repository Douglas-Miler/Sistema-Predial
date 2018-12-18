package br.com.sistemaControlePredial.model;

import java.util.*;

public class Conjunto 
{
   private int andar, numero, idConjunto, temperaturaAtual;
   public String Empresa_CNPJ, statusArCondicionado;
   
   public Conjunto(int andar, int numero, int idConunto) 
   {
      setAndar(andar);
      setNumero(numero);
      setIdConjunto(idConunto);
   }
   
   //getObjetoConjunto
   public Conjunto(int andar, int numero, int idConunto, String Empresa_CNPJ)
   {
	   setAndar(andar);
	   setNumero(numero);
	   setIdConjunto(idConunto);
	   this.Empresa_CNPJ = Empresa_CNPJ;
   }
   
   //lerRegistros
   public Conjunto(int idConjunto, String Empresa_CNPJ, int temperaturaAtual, String statusArCondicionado)
   {
	   setIdConjunto(idConjunto);
	   setTemperaturaAtual(temperaturaAtual);
	   setStatusArCondicionado(statusArCondicionado);
	   this.Empresa_CNPJ = Empresa_CNPJ;
   }
   
   public Conjunto()
   {
	   
   }

	// Metodos modificadores e de acesso
   public void setAndar(int andar) 
   {
      this.andar = andar;
   }
   
   private void setTemperaturaAtual(int temperaturaAtual) {
	   this.temperaturaAtual = temperaturaAtual;
   }
   
   public int getTemperaturaAtual()
   {
	   return temperaturaAtual;
   }
   
   private void setStatusArCondicionado(String statusArCondicionado) {
	   this.statusArCondicionado = statusArCondicionado;
   }
   
   public String getStatusArCondicionado()
   {
	   return statusArCondicionado;
   }
   
   public int getAndar() 
   {
      return andar;
   }

   public void setNumero(int numero) 
   {
      this.numero = numero;
   }
   public int getNumero() 
   {
      return numero;
   }

   public void setIdConjunto(int idConjunto) 
   {
      this.idConjunto = idConjunto;
   }
   public int getIdConjunto() 
   {
      return idConjunto;
   }
   
   //CRUD
   public void cadastrar(String cnpj, int idConjunto)
   {
      ConjuntoDAO c = new ConjuntoDAO();
      c.atualizar(cnpj,idConjunto);
   }
   public int totalConjuntosVazios()
   {
	   ConjuntoDAO c = new ConjuntoDAO();
	   return c.totalConjuntosVazios();
   }
   public int totalConjuntos(String CNPJ)
   {
	   ConjuntoDAO c = new ConjuntoDAO();
	   return c.totalConjuntos(CNPJ);
   }
   public ArrayList<Conjunto> consultar()
   {
      ConjuntoDAO c = new ConjuntoDAO();
      return c.consultar();
   }
   
   public ArrayList<Conjunto> getObjetoConjunto()
   {
	   ConjuntoDAO  c = new ConjuntoDAO();
	   return c.getObjetoConjunto();
   }
   
   public ArrayList<Conjunto> getObjetoConjunto( String cnpj )
   {
	   ConjuntoDAO  c = new ConjuntoDAO();
	   return c.getObjetoConjunto( cnpj );
   }
   
   public void remover(String CNPJ)
   {
      ConjuntoDAO c = new ConjuntoDAO();
      c.remover(CNPJ);
   }
   public ArrayList<Conjunto> EmpresaConsultar(String CNPJ)
   {
	   ConjuntoDAO c = new ConjuntoDAO();
	   return c.EmpresaConsultar(CNPJ);
   }
   public ArrayList<Conjunto> atualizarEmpresa(String CNPJ)
   {
	   ConjuntoDAO c = new ConjuntoDAO();
	   return c.atualizarEmpresa(CNPJ);
   }
}