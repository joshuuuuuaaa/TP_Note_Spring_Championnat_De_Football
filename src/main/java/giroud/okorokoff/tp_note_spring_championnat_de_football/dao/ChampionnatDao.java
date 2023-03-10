package giroud.okorokoff.tp_note_spring_championnat_de_football.dao;

import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Championnat;
import giroud.okorokoff.tp_note_spring_championnat_de_football.pojos.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionnatDao extends JpaRepository<Championnat, Long> {
    List<Championnat> findChampionnatsByPays(Pays pays);
    Championnat findChampionnatsByNom(String Nom);
}
