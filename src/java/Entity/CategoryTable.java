/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SchidloE
 */
@Entity
@Table(name = "category_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryTable.findAll", query = "SELECT c FROM CategoryTable c"),
    @NamedQuery(name = "CategoryTable.findByCategoryId", query = "SELECT c FROM CategoryTable c WHERE c.categoryId = :categoryId"),
    @NamedQuery(name = "CategoryTable.findByName", query = "SELECT c FROM CategoryTable c WHERE c.name = :name")})
public class CategoryTable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name")
    private String name;

    public CategoryTable() {
    }

    public CategoryTable(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryTable(Integer categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryTable)) {
            return false;
        }
        CategoryTable other = (CategoryTable) object;
        if ((this.categoryId == null && other.categoryId != null) || (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.CategoryTable[ categoryId=" + categoryId + " ]";
    }
    
}
