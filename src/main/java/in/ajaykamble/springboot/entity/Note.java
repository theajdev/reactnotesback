package in.ajaykamble.springboot.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="tbl_notes")
@Data
public class Note {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String title;
	private String body;
	private String category;
	@Column(name="created_at",nullable=false, updatable=false)
	@CreationTimestamp
	private Date createdAt;
	@Column(name="updated_at")
	@UpdateTimestamp
	private Date updatedAt;
	
}
