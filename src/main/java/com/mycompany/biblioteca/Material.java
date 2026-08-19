
package com.mycompany.biblioteca;


public class Material {
    private String code;
    private String title;
    private String publicDate;

    public Material(String code, String title, String publicDate) {
        this.code = code;
        this.title = title;
        this.publicDate = publicDate;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }
    
}
