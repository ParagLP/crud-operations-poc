package com.viraj.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="COMPANY")
public class Company
{
    @Id
    @Column(name = "COMPANY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empId",referencedColumnName = "COMPANY_ID")
    private List<Employee> employees;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName=" + companyName +
                '}';
    }
}

