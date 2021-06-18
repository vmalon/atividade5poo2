package model.entities;

public class Disciplina {
 private int idDisciplina;
 private String nomeDisciplina;
 private int cargaHoraria;
 
 public Disciplina() {
	 
 }
 
public Disciplina(int idDisciplina, String nomeDisciplina, int cargaHoraria) {
	this.idDisciplina = idDisciplina;
	this.nomeDisciplina = nomeDisciplina;
	this.cargaHoraria = cargaHoraria;
}

public int getIdDisciplina() {
	return idDisciplina;
}

public void setIdDisciplina(int idDisciplina) {
	this.idDisciplina = idDisciplina;
}

public String getNomeDisciplina() {
	return nomeDisciplina;
}

public void setNomeDisciplina(String nomeDisciplina) {
	this.nomeDisciplina = nomeDisciplina;
}

public int getCargaHoraria() {
	return cargaHoraria;
}

public void setCargaHoraria(int cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + cargaHoraria;
	result = prime * result + idDisciplina;
	result = prime * result + ((nomeDisciplina == null) ? 0 : nomeDisciplina.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Disciplina other = (Disciplina) obj;
	if (cargaHoraria != other.cargaHoraria)
		return false;
	if (idDisciplina != other.idDisciplina)
		return false;
	if (nomeDisciplina == null) {
		if (other.nomeDisciplina != null)
			return false;
	} else if (!nomeDisciplina.equals(other.nomeDisciplina))
		return false;
	return true;
}
 
@Override
public String toString() {
	return "Disciplina [idDisciplina=" + idDisciplina + ", nomeDisciplina=" + nomeDisciplina + ", cargaHoraria="
			+ cargaHoraria + "]";
	}
}
