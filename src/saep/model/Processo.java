package saep.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="processo")
public class Processo {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="processo_id")
    private long id;
	
	@Column(name="data_criacao")
    private Date dataCriacao;
	
	@OneToOne(mappedBy="processo")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Parecer parecer;
	
	
}
