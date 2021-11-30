package br.com.foursys.locadora.backingbean;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "indexBacking")
@ViewScoped
public class IndexBacking implements Serializable {

	private static final long serialVersionUID = 1L;


	public void cliente() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("cad-cliente.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void funcionario() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("cad-funcionario.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void locacao() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("cad-locacao.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void devolucao() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("cad-devolucao.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void consultaLocacao() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("list-locacao.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void consultaFilme() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("list-filme.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void consultaCliente() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("list-cliente.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
