package cpen391.friendhub.models;

import android.util.Log;

/**
 * Created by Srinjoy on 3/11/2017.
 */


public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String bio;
    private String createdAt;
    private String updatedAt;
    private int numAttributes = 5;
    // an array storing the 5 points we based our attributes on
    private double attributes[]= {  0.0,    //Extraversion
                                    0.0,    //Openness
                                    0.0,    //Agreeableness
                                    0.0,    //Conscientiousness
                                    0.0};   //Neuroticism


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public double[] getAttributes(){
        double returnArray[] = new double[numAttributes];
        System.arraycopy(attributes, 0, returnArray,0, attributes.length);
        return returnArray;
    }

    public boolean updateAttributes(int attributeNum, double score){
        if (score <= 10 && score > 0) attributes[attributeNum] = score; return attributesInvariant();}

    private boolean attributesInvariant() {
        int initChecker = 0;
        for (double d : attributes) {
            if (d == 0)
                initChecker++;
            if (d > 10 || d < 0)
                return false;
        }
        if (initChecker == numAttributes){
            Log.e("Attributes", "All Attributes Zero");
            return false;
        }
        return true;
    }

    public String attributesToString(){
        String returnString;
        returnString = "(";
        for(double d : attributes) {
            returnString.concat(Double.toString(d) + ", ");
        }
        if(!attributesInvariant()){
            Log.e("Attributes", "Attribute Problem:"+ returnString);
        }
        return returnString.substring(0,returnString.length()-1)+")";
    }

    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ",name='" + name + '\'' +
                ", email=" + email +
                ", bio=" + bio +
                ", attributes =" + attributesToString() +
                '}';
    }
}
