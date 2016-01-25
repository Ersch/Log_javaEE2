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
 * @author Eric Schidlo
 */
@Entity
@Table(name = "article_table")
public class Article {

    @Id
    private int article_id;
    private String name;
    private String description;
    private Category category_id;
    private float price;

    public Article() {
    }

    public Article(int article_id, String name, String description, Category category_id, float price) {
        this.article_id = article_id;
        this.name = name;
        this.description = description;
        this.category_id = category_id;
        this.price = price;
    }

    public Article(int article_id, String name, float price) {
        this.article_id = article_id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer getId() {
        return article_id;
    }

    public boolean equals(Article otherArticle) {
        return Objects.equals(this.article_id, otherArticle.article_id); //To change body of generated methods, choose Tools | Templates.
    }
    
        public int compareTo(Article otherArticle) {

        return (this.name).compareTo(otherArticle.name);

    }
        
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.article_id);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.category_id);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }        
        
    public int getArticle_id() {
        return article_id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public float getPrice() {
        return price;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public void setPrice(float price) {
        this.price = price;
    }    
}
