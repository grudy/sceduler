/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author waa
 */
@Entity
@Table(name = "EMPLOYEES")
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findById", query = "SELECT e FROM Employees e WHERE e.id = :id"),
    @NamedQuery(name = "Employees.findByFirstName", query = "SELECT e FROM Employees e WHERE e.firstName = :firstName"),
    @NamedQuery(name = "Employees.findByLastName", query = "SELECT e FROM Employees e WHERE e.lastName = :lastName"),
    @NamedQuery(name = "Employees.findByEmployeeName", query = "SELECT e FROM Employees e WHERE e.employeeName = :employeeName"),
    @NamedQuery(name = "Employees.findByMondayStart", query = "SELECT e FROM Employees e WHERE e.mondayStart = :mondayStart"),
    @NamedQuery(name = "Employees.findByMondayFinish", query = "SELECT e FROM Employees e WHERE e.mondayFinish = :mondayFinish"),
    @NamedQuery(name = "Employees.findByTuesdayStart", query = "SELECT e FROM Employees e WHERE e.tuesdayStart = :tuesdayStart"),
    @NamedQuery(name = "Employees.findByTuesdayFinish", query = "SELECT e FROM Employees e WHERE e.tuesdayFinish = :tuesdayFinish"),
    @NamedQuery(name = "Employees.findByWednesdayStart", query = "SELECT e FROM Employees e WHERE e.wednesdayStart = :wednesdayStart"),
    @NamedQuery(name = "Employees.findByWednesdayFinish", query = "SELECT e FROM Employees e WHERE e.wednesdayFinish = :wednesdayFinish"),
    @NamedQuery(name = "Employees.findByThursdayStart", query = "SELECT e FROM Employees e WHERE e.thursdayStart = :thursdayStart"),
    @NamedQuery(name = "Employees.findByThursdayFinish", query = "SELECT e FROM Employees e WHERE e.thursdayFinish = :thursdayFinish"),
    @NamedQuery(name = "Employees.findByFridayStart", query = "SELECT e FROM Employees e WHERE e.fridayStart = :fridayStart"),
    @NamedQuery(name = "Employees.findByFridayFinish", query = "SELECT e FROM Employees e WHERE e.fridayFinish = :fridayFinish"),
    @NamedQuery(name = "Employees.findBySaturdayStart", query = "SELECT e FROM Employees e WHERE e.saturdayStart = :saturdayStart"),
    @NamedQuery(name = "Employees.findBySaturdayFinish", query = "SELECT e FROM Employees e WHERE e.saturdayFinish = :saturdayFinish"),
    @NamedQuery(name = "Employees.findBySundayStart", query = "SELECT e FROM Employees e WHERE e.sundayStart = :sundayStart"),
    @NamedQuery(name = "Employees.findBySundayFinish", query = "SELECT e FROM Employees e WHERE e.sundayFinish = :sundayFinish")})
public class Employees implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;
    @Column(name = "MONDAY_START")
    @Temporal(TemporalType.TIME)
    private Date mondayStart;
    @Column(name = "MONDAY_FINISH")
    @Temporal(TemporalType.TIME)
    private Date mondayFinish;
    @Column(name = "TUESDAY_START")
    @Temporal(TemporalType.TIME)
    private Date tuesdayStart;
    @Column(name = "TUESDAY_FINISH")
    @Temporal(TemporalType.TIME)
    private Date tuesdayFinish;
    @Column(name = "WEDNESDAY_START")
    @Temporal(TemporalType.TIME)
    private Date wednesdayStart;
    @Column(name = "WEDNESDAY_FINISH")
    @Temporal(TemporalType.TIME)
    private Date wednesdayFinish;
    @Column(name = "THURSDAY_START")
    @Temporal(TemporalType.TIME)
    private Date thursdayStart;
    @Column(name = "THURSDAY_FINISH")
    @Temporal(TemporalType.TIME)
    private Date thursdayFinish;
    @Column(name = "FRIDAY_START")
    @Temporal(TemporalType.TIME)
    private Date fridayStart;
    @Column(name = "FRIDAY_FINISH")
    @Temporal(TemporalType.TIME)
    private Date fridayFinish;
    @Column(name = "SATURDAY_START")
    @Temporal(TemporalType.TIME)
    private Date saturdayStart;
    @Column(name = "SATURDAY_FINISH")
    @Temporal(TemporalType.TIME)
    private Date saturdayFinish;
    @Column(name = "SUNDAY_START")
    @Temporal(TemporalType.TIME)
    private Date sundayStart;
    @Column(name = "SUNDAY_FINISH")
    @Temporal(TemporalType.TIME)
    private Date sundayFinish;
    @Lob
    @Column(name = "PASSWORD")
    private String password;
    @Lob
    @Column(name = "EMAIL")
    private String email;

    public Employees() {
    }

    public Employees(Integer id) {
        this.id = id;
    }

    public Employees(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        String oldEmployeeName = this.employeeName;
        this.employeeName = employeeName;
        changeSupport.firePropertyChange("employeeName", oldEmployeeName, employeeName);
    }

    public Date getMondayStart() {
        return mondayStart;
    }

    public void setMondayStart(Date mondayStart) {
        Date oldMondayStart = this.mondayStart;
        this.mondayStart = mondayStart;
        changeSupport.firePropertyChange("mondayStart", oldMondayStart, mondayStart);
    }

    public Date getMondayFinish() {
        return mondayFinish;
    }

    public void setMondayFinish(Date mondayFinish) {
        Date oldMondayFinish = this.mondayFinish;
        this.mondayFinish = mondayFinish;
        changeSupport.firePropertyChange("mondayFinish", oldMondayFinish, mondayFinish);
    }

    public Date getTuesdayStart() {
        return tuesdayStart;
    }

    public void setTuesdayStart(Date tuesdayStart) {
        Date oldTuesdayStart = this.tuesdayStart;
        this.tuesdayStart = tuesdayStart;
        changeSupport.firePropertyChange("tuesdayStart", oldTuesdayStart, tuesdayStart);
    }

    public Date getTuesdayFinish() {
        return tuesdayFinish;
    }

    public void setTuesdayFinish(Date tuesdayFinish) {
        Date oldTuesdayFinish = this.tuesdayFinish;
        this.tuesdayFinish = tuesdayFinish;
        changeSupport.firePropertyChange("tuesdayFinish", oldTuesdayFinish, tuesdayFinish);
    }

    public Date getWednesdayStart() {
        return wednesdayStart;
    }

    public void setWednesdayStart(Date wednesdayStart) {
        Date oldWednesdayStart = this.wednesdayStart;
        this.wednesdayStart = wednesdayStart;
        changeSupport.firePropertyChange("wednesdayStart", oldWednesdayStart, wednesdayStart);
    }

    public Date getWednesdayFinish() {
        return wednesdayFinish;
    }

    public void setWednesdayFinish(Date wednesdayFinish) {
        Date oldWednesdayFinish = this.wednesdayFinish;
        this.wednesdayFinish = wednesdayFinish;
        changeSupport.firePropertyChange("wednesdayFinish", oldWednesdayFinish, wednesdayFinish);
    }

    public Date getThursdayStart() {
        return thursdayStart;
    }

    public void setThursdayStart(Date thursdayStart) {
        Date oldThursdayStart = this.thursdayStart;
        this.thursdayStart = thursdayStart;
        changeSupport.firePropertyChange("thursdayStart", oldThursdayStart, thursdayStart);
    }

    public Date getThursdayFinish() {
        return thursdayFinish;
    }

    public void setThursdayFinish(Date thursdayFinish) {
        Date oldThursdayFinish = this.thursdayFinish;
        this.thursdayFinish = thursdayFinish;
        changeSupport.firePropertyChange("thursdayFinish", oldThursdayFinish, thursdayFinish);
    }

    public Date getFridayStart() {
        return fridayStart;
    }

    public void setFridayStart(Date fridayStart) {
        Date oldFridayStart = this.fridayStart;
        this.fridayStart = fridayStart;
        changeSupport.firePropertyChange("fridayStart", oldFridayStart, fridayStart);
    }

    public Date getFridayFinish() {
        return fridayFinish;
    }

    public void setFridayFinish(Date fridayFinish) {
        Date oldFridayFinish = this.fridayFinish;
        this.fridayFinish = fridayFinish;
        changeSupport.firePropertyChange("fridayFinish", oldFridayFinish, fridayFinish);
    }

    public Date getSaturdayStart() {
        return saturdayStart;
    }

    public void setSaturdayStart(Date saturdayStart) {
        Date oldSaturdayStart = this.saturdayStart;
        this.saturdayStart = saturdayStart;
        changeSupport.firePropertyChange("saturdayStart", oldSaturdayStart, saturdayStart);
    }

    public Date getSaturdayFinish() {
        return saturdayFinish;
    }

    public void setSaturdayFinish(Date saturdayFinish) {
        Date oldSaturdayFinish = this.saturdayFinish;
        this.saturdayFinish = saturdayFinish;
        changeSupport.firePropertyChange("saturdayFinish", oldSaturdayFinish, saturdayFinish);
    }

    public Date getSundayStart() {
        return sundayStart;
    }

    public void setSundayStart(Date sundayStart) {
        Date oldSundayStart = this.sundayStart;
        this.sundayStart = sundayStart;
        changeSupport.firePropertyChange("sundayStart", oldSundayStart, sundayStart);
    }

    public Date getSundayFinish() {
        return sundayFinish;
    }

    public void setSundayFinish(Date sundayFinish) {
        Date oldSundayFinish = this.sundayFinish;
        this.sundayFinish = sundayFinish;
        changeSupport.firePropertyChange("sundayFinish", oldSundayFinish, sundayFinish);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "schedule.Employees[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
