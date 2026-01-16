package es.upm.grise.profundizacion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoanApprovalServiceTest {
    
    private final LoanApprovalService service = new LoanApprovalService();

    @Test
    void TODO_caso_camino_basico_1() {
        //N 1,2,10,11,12
        // No es accesible por logica el estado 2 y el 11 en la misma ejecucion (no hay manual review)
        assertTrue(true);
    }

    @Test
    void TODO_caso_camino_basico_2() {
        //N 1,2,10,12
        LoanApprovalService.Applicant applicant = new LoanApprovalService.Applicant(
                1000,
                1,
                true,
                true);
        LoanApprovalService loanApprovalService = new LoanApprovalService();
        LoanApprovalService.Decision result = loanApprovalService.evaluateLoan(applicant,
                2000,
                6);

        assertEquals(LoanApprovalService.Decision.REJECTED, result);
    }

    @Test
    void TODO_caso_camino_basico_3() {
        //N 1,3,5,8,10,11,12
        //No es posible, N 8 y 11 no son compatibles en la misma ejecucion (no hay manual review)
        assertTrue(true);
    }

    @Test
    void TODO_caso_camino_basico_4() {
        //N 1,3,5,8,10,12
        LoanApprovalService.Applicant applicant = new LoanApprovalService.Applicant(
                1000,
                800,
                true,
                true);
        LoanApprovalService loanApprovalService = new LoanApprovalService();
        LoanApprovalService.Decision result = loanApprovalService.evaluateLoan(applicant,
                2000,
                6);

        assertEquals(LoanApprovalService.Decision.APPROVED, result);
    }

    @Test
    void TODO_caso_camino_basico_5() {
        //N 1,3,4,6,10,11,12
        LoanApprovalService.Applicant applicant = new LoanApprovalService.Applicant(
                3000,
                600,
                false,
                true);
        LoanApprovalService loanApprovalService = new LoanApprovalService();
        LoanApprovalService.Decision result = loanApprovalService.evaluateLoan(applicant,
                2000,
                6);

        assertEquals(LoanApprovalService.Decision.APPROVED, result);
    }

    @Test
    void TODO_caso_camino_basico_6() {
        //N 1,3,4,6,10,12
        LoanApprovalService.Applicant applicant = new LoanApprovalService.Applicant(
                3000,
                600,
                false,
                false);
        LoanApprovalService loanApprovalService = new LoanApprovalService();
        LoanApprovalService.Decision result = loanApprovalService.evaluateLoan(applicant,
                2000,
                6);

        assertEquals(LoanApprovalService.Decision.MANUAL_REVIEW, result);
    }

    @Test
    void TODO_caso_camino_basico_7() {
        //N 1,3,5,9,10,11,12
        LoanApprovalService.Applicant applicant = new LoanApprovalService.Applicant(
                1,
                800,
                false,
                true);
        LoanApprovalService loanApprovalService = new LoanApprovalService();
        LoanApprovalService.Decision result = loanApprovalService.evaluateLoan(applicant,
                2000,
                6);


        assertEquals(LoanApprovalService.Decision.APPROVED, result);
    }

    @Test
    void TODO_caso_camino_basico_8() {
        //N 1,3,5,9,10,12
        LoanApprovalService.Applicant applicant = new LoanApprovalService.Applicant(
                1,
                800,
                false,
                false);
        LoanApprovalService loanApprovalService = new LoanApprovalService();
        LoanApprovalService.Decision result = loanApprovalService.evaluateLoan(applicant,
                2000,
                6);

        assertEquals(LoanApprovalService.Decision.MANUAL_REVIEW, result);
    }

    void TODO_caso_camino_basico_9() {
        //N 1,3,4,7,10,11,12
        //No es posible, N 7 y 11 no son compatibles en la misma ejecucion (no hay manual review)
        assertTrue(true);
    }

    @Test
    void TODO_caso_camino_basico_10() {
        //N 1,3,4,7,10,12
        LoanApprovalService.Applicant applicant = new LoanApprovalService.Applicant(
                1,
                600,
                true,
                false);
        LoanApprovalService loanApprovalService = new LoanApprovalService();
        LoanApprovalService.Decision result = loanApprovalService.evaluateLoan(applicant,
                2000,
                6);

        assertEquals(LoanApprovalService.Decision.REJECTED, result);
    }

    
}
