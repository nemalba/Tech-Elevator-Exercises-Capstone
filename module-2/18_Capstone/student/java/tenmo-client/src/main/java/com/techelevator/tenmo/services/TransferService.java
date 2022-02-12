package com.techelevator.tenmo.services;

import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.AuthenticatedUser;
import com.techelevator.tenmo.model.TransferDTO;
import com.techelevator.tenmo.model.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Scanner;

public class TransferService {
    private String baseUrl;
    private RestTemplate restTemplate = new RestTemplate();
   // private String authToken;
    private AuthenticatedUser currentUser;


    public TransferService(String baseUrl, AuthenticatedUser currentUser) {
        this.baseUrl = baseUrl;
        this.currentUser = currentUser;
    }

    public void sendBucks() {

        User[] users = null;
        TransferDTO transferDto = new TransferDTO();

        Scanner input = new Scanner(System.in);
        users = restTemplate.exchange(baseUrl + "/users", HttpMethod.GET, makeAuthEntity(), User[].class).getBody();
        System.out.println("-------------------------------------------\r\n" + "Users\r\n" + "ID\t\tName\r\n" +
                "-------------------------------------------");
        for (User i : users) {
            if (i.getId() != currentUser.getUser().getId()) {
                System.out.println(i.getId() + "\t\t" + i.getUsername());
            }
        }
        System.out.print("-------------------------------------------\r\n" +
                "Enter ID of user you are sending to (0 to cancel): ");
        transferDto.setAccountTo(Integer.parseInt(input.nextLine()));
        transferDto.setAccountFrom(currentUser.getUser().getId());

        System.out.print("Enter amount: ");
        transferDto.setAmount(new BigDecimal(Double.parseDouble(input.nextLine())));

    }

    private HttpEntity<Void> makeAuthEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(currentUser.getToken());
        return new HttpEntity<>(headers);
    }
    private HttpEntity<TransferDTO> makeTransferDtoAuthEntity(TransferDTO transferDTO) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(currentUser.getToken());
        return new HttpEntity<TransferDTO>(transferDTO,headers);
    }

}
