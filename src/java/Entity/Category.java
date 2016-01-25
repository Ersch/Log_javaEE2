/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rikki
 */
@Entity
@Table(name="category_table")
public class Category  {

    @Id
    private int category_id;
    private String name;

    public Category() {
    }

    public Category(int category_id, String name) {
        this.category_id = category_id;
        this.name = name;
    }

    public Integer getId() {

        return category_id;

    }

    public boolean equals(Category otherCategory) {

        return Objects.equals(this.category_id, otherCategory.category_id);

    }

    @Override
    public String toString() {
        return "Category = " + name;
    }

    public int compareTo(Category c1) {

        return (this.name).compareTo(c1.name);

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.category_id);
        hash = 17 * hash + Objects.hashCode(this.name);
        return hash;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getName() {
        return name;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
