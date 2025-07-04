# HospitalMangamentsystem-javaswing

A desktop‑based Java Swing application to manage hospital operations.  
It provides GUI forms for managing doctors, patients, and accounts, all tied together with a central dashboard.

---
## 🔍 Features
- **LoginPage**
  ID and Password: "admin"
- **Dashboard**  
  Quick overview screen on launch, with navigation to all modules.
- **Doctor Management**  
  - Add, edit, and remove doctor records  
  - Stores fields such as name, specialty, contact info
- **Patient Management**  
  - Register new patients  
  - Update patient details, view history
- **Account Management**  
  - Handle billing and payments  
  - Track invoices and transactions
- **Visual Assets**  
  Embedded icons/graphics for hospital logo, doctor, patient, lab reports, insurance, etc.

## 🚀 Tech Stack
- **Language:** Java SE  
- **GUI Framework:** Swing

## Database Schema

### Doctors
- **DoctorID**: INT
- **FullName**: VARCHAR
- **FatherName**: VARCHAR
- **DOB**: VARCHAR
- **Gender**: VARCHAR
- **Specialization**: VARCHAR
- **Contact**: VARCHAR
- **Email**: VARCHAR
- **DateofJoining**: VARCHAR

### Patients
- **PatientID**: INT
- **FullName**: VARCHAR
- **FatherName**: VARCHAR
- **DOB**: VARCHAR
- **BloodGroup**: VARCHAR
- **Gender**: VARCHAR
- **Contact**: VARCHAR
- **Room**: VARCHAR
- **MedInfo**: VARCHAR

### Accounts
- **PatientID**: INT
- **Name**: VARCHAR
- **FatherName**: VARCHAR
- **Gender**: VARCHAR
- **BillStatus**: VARCHAR

## Project Screenshots



