package org.projecttherevelation.edusync.Students;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import au.com.bytecode.opencsv.CSVReader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StudentCSVService {

    private final StudentRepo studentRepo;

    public StudentCSVService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void saveDataFromCsv(MultipartFile file) throws IOException {
        try (Reader reader = new InputStreamReader(file.getInputStream())) {
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                // Assuming the order of columns in CSV matches the order of fields in StudentModel
                StudentModel studentModel = new StudentModel();
                studentModel.setHitMail(nextRecord[0]);
                studentModel.setYearEnrolled(nextRecord[1]);
                studentModel.setFirstName(nextRecord[2]);
                studentModel.setStatus(nextRecord[3]);
                studentModel.setLastName(nextRecord[4]);
                studentModel.setProgramme(nextRecord[5]);
                studentModel.setDepartment(nextRecord[6]);
                studentModel.setDateOfBirth(nextRecord[7]);
                studentModel.setPhoneNumber(nextRecord[8]);
                studentModel.setEmail(nextRecord[9]);
                studentModel.setNextOfKin(nextRecord[10]);
                studentModel.setGuardianNumber(nextRecord[11]);
                studentModel.setAddress(nextRecord[12]);

                // Save the user to the database using the JpaRepository's save method
                studentRepo.save(studentModel);
            }
        }
    }
}
