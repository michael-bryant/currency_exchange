import java.io.*;
import java.net.*;
import java.util.*;

public class ExchangeServer {
    public static void main(String[] args) throws Exception {
        ServerSocket mySocket = new ServerSocket(69000);
        System.out.println("Server is listening...");

        while(true) {
            Socket clientSocket = mySocket.accept();
            OutputStream my_OS = clientSocket.getOutputStream();
            DataOutputStream my_DOS = new DataOutputStream(my_OS);
            InputStream my_IS = clientSocket.getInputStream();
            InputStreamReader my_ISR = new InputStreamReader(my_IS);
            BufferedReader my_BR = new BufferedReader(my_ISR);

            String uncond_val = my_BR.readLine();
            input  = input.toUpperCase();
            myDOS.writeBytes(input + '\n');

            clientSocket.close();
        }
    }

    public double convert_curr(double std_curr_in, String desired_curr){
          double curr_out = 0.00;
	 /* switch(desired_curr)
	}*/

    public double standardize_in(double currency_in, String base_curr) {
  	double currency_std = 0;
	if(base_curr.equals("USD")){
	    return currency_in;
	    }
	else {
	    switch (base_curr) {
		case "GBP": currency_std = currency_in * 1.29570;
		break;
		case "INR": currency_std = currency_in * 0.0141215;
		break;
		case "EUR": currency_std = currency_in * 1.16081;
		break;
		default:"Invalid currency";
		break;
	    }
	}
	return currency_std;
}
