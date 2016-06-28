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
@Table(name="parecer")
public class Parecer {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="parecer_id")
    private long id;
	
	@Column(name="data_criacao")
    private Date dataCriacao;
	
	@OneToOne(mappedBy="parecer")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Processo processo;
	
	
}
