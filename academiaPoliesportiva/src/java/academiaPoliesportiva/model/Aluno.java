/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author aluno
 */
@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeAluno;
    @ManyToMany( fetch = FetchType.EAGER)
    private List<Atividade> atividades;
    @OneToMany(cascade = CascadeType.REMOVE)
    private final List<Mensalidade> mensalidades;
    
    public Aluno() {
        nomeAluno = "";
        atividades = new ArrayList<>();
        mensalidades = new ArrayList<>();
    }

    public String getNome() {
        return nomeAluno;
    }

    public void setNome(String nome) {
        this.nomeAluno = nome;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    List<Mensalidade> getMensalidades() {
        return this.mensalidades;
    }

    @Override
    public String toString() {
        return nomeAluno ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    public void matricula(Atividade atividade) {
        this.getAtividades().add(atividade);
        Mensalidade novaMensalidade = new Mensalidade();
        novaMensalidade.setAtividade(atividade);
        novaMensalidade.setValor(atividade.getMensalidade() * 1.5);
        novaMensalidade.setAluno(this);
        novaMensalidade.setDataPagamento(new Date());
        novaMensalidade.setDataVencimento(new Date());
        this.getMensalidades().add(novaMensalidade);
    }

  
   

    
}
