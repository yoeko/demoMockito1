package domaine;

public class Etudiant {
	
	private int id;
	private int nom;
	private int prenom;
	
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Etudiant(int id, int nom, int prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNom() {
		return nom;
	}

	public void setNom(int nom) {
		this.nom = nom;
	}

	public int getPrenom() {
		return prenom;
	}

	public void setPrenom(int prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
