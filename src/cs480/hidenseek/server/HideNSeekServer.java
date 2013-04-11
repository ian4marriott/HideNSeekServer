package cs480.hidenseek.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class HideNSeekServer {
  
  static double azusa_lat = 34.129036;
  static double azusa_lng = -117.889802;
  
  public static void main(String[] args) throws IOException {

    ServerSocket serverSocket = null;
    try {
      serverSocket = new ServerSocket(9001);
    } catch (IOException e) {
      System.err.println("Could not listen on port: 9001.");
      System.exit(1);
    }

    Socket clientSocket = null;
    try {
      clientSocket = serverSocket.accept();
    } catch (IOException e) {
      System.err.println("Accept failed.");
      System.exit(1);
    }

    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    String inputLine;

    while ((inputLine = in.readLine()) != null) {
      String[] location = inputLine.split(":");
      if(location.length == 3) {
        String adnroidId = location[0];
        double lat = Double.parseDouble(location[1]);
        double lng = Double.parseDouble(location[2]);
        if( distFrom(azusa_lat, azusa_lng, lat, lng) < 10) {
          out.println("You tagged Thomas, he totally sucks");
        } else {
          out.println("You aren't close enough to tag Thomas, he is so illusive!");
        }
      }
      System.out.println(inputLine);
 
    }
    out.close();
    in.close();
    clientSocket.close();
    serverSocket.close();
  }

  public static double distFrom(double lat1, double lng1, double lat2, double lng2) {
    double earthRadius = 3958.75;
    double dLat = Math.toRadians(lat2 - lat1);
    double dLng = Math.toRadians(lng2 - lng1);
    double sindLat = Math.sin(dLat / 2);
    double sindLng = Math.sin(dLng / 2);
    double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(lat1))
            * Math.cos(Math.toRadians(lat2));
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double dist = earthRadius * c;

    return dist;
  }
}