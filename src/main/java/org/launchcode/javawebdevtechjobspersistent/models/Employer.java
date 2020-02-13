package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    public Employer() {

    }
    @NotBlank(message = "Location is required.")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters")
    private String location;
    @OneToMany(mappedBy = "employer")
    private List<Job> jobList;
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }
}
