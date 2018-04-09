package de.hska.iwi.vislab.lab1.example;

import de.hska.iwi.vislab.lab1.example.ws.BuecherServiceImpl;
import de.hska.iwi.vislab.lab1.example.ws.FibonacciServiceImpl;

import javax.swing.*;
import javax.xml.ws.Endpoint;

/** Testserver fuer den Webservice */
public class TestWsServer {
  public static void main(final String[] args) {
    String url = (args.length > 0) ? args[0] : "http://localhost:4434/buecherservice";
    String fibonacciURL = "http://localhost:4434/fibonacciService";
    Endpoint ep = Endpoint.publish(url, new BuecherServiceImpl());
    Endpoint fibonacciEP = Endpoint.publish(fibonacciURL, new FibonacciServiceImpl());
    JOptionPane.showMessageDialog(null, "TestWsServer beenden");
    ep.stop();
    fibonacciEP.stop();
  }
}
