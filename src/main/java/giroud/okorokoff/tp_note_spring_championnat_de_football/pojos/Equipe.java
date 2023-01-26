package giroud.okorokoff.tp_note_spring_championnat_de_football.pojos;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Equipe {
    // Propriétés
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date DateCreation;
    private String Logo;
    private String NomEntraineur;
    private String President;
    private String Status;
    private String Siege;
    private String Telephone;
    private String SiteWeb;
    private String nom;

    public Equipe(String nom, Date dateCreation, String logo, String nomEntraineur, String president, String status, String siege, String telephone, String siteWeb) {
        this.nom = nom;
        DateCreation = dateCreation;
        Logo = logo;
        NomEntraineur = nomEntraineur;
        President = president;
        Status = status;
        Siege = siege;
        Telephone = telephone;
        SiteWeb = siteWeb;
    }

    public Equipe() {

    }

    // Relation exterieurs
    @ManyToMany
    private List<Championnat> championnat;
    @ManyToOne
    private Stade stade;
    @OneToMany(mappedBy="Equipe1")
    private List<Matchs> match;

    // Getter et Setter
    public List<Championnat> getChampionnat() { return championnat; }
    public void setChampionnat(List<Championnat> championnat) { this.championnat = championnat; }

    public Stade getStade() {
        return stade;
    }
    public void setStade(Stade stade) {
        this.stade = stade;
    }

    public List<Matchs> getMatch() {
        return match;
    }
    public void setMatch(List<Matchs> match) { this.match = match; }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateCreation() {
        return DateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        DateCreation = dateCreation;
    }

    public String getLogo() {
        return Logo;
    }
    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getNomEntraineur() {
        return NomEntraineur;
    }
    public void setNomEntraineur(String nomEntraineur) {
        NomEntraineur = nomEntraineur;
    }

    public String getPresident() {
        return President;
    }
    public void setPresident(String president) {
        President = president;
    }

    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }

    public String getSiege() {
        return Siege;
    }
    public void setSiege(String siege) {
        Siege = siege;
    }

    public String getTelephone() {
        return Telephone;
    }
    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getSiteWeb() {
        return SiteWeb;
    }
    public void setSiteWeb(String siteWeb) {
        SiteWeb = siteWeb;
    }
}
