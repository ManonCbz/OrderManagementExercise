package model;

import java.util.HashMap;

public class Commande {

		// ================================= Attributes ================================= //
	
		private int id;
		private String date;
		private String amount;
		private String paymentMethod;
		private String paymentStatus;
		private String deliveryMethod;
		private String deliveryStatus;
		private Client customer;
		private HashMap<Integer, Integer> listeAchat = new HashMap<Integer, Integer>();

		// ================================= Constructor  ================================= //
		
		public Commande(String date, String amount, String paymentMethod, String paymentStatus, String deliveryMethod,
				String deliveryStatus, Client customer) {

			this.date = date;
			this.amount = amount;
			this.paymentMethod = paymentMethod;
			this.paymentStatus = paymentStatus;
			this.deliveryMethod = deliveryMethod;
			this.deliveryStatus = deliveryStatus;
			this.customer = customer;

		}
		
		public Commande(int id, String date, String amount, String paymentMethod, String paymentStatus, String deliveryMethod,
				String deliveryStatus, Client customer) {

			this.id = id;
			this.date = date;
			this.amount = amount;
			this.paymentMethod = paymentMethod;
			this.paymentStatus = paymentStatus;
			this.deliveryMethod = deliveryMethod;
			this.deliveryStatus = deliveryStatus;
			this.customer = customer;

		}

		// ================================= Getter & Setter ================================= //
		
		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getPaymentMethod() {
			return paymentMethod;
		}

		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}

		public String getPaymentStatus() {
			return paymentStatus;
		}

		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}

		public String getDeliveryMethod() {
			return deliveryMethod;
		}

		public void setDeliveryMethod(String deliveryMethod) {
			this.deliveryMethod = deliveryMethod;
		}

		public String getDeliveryStatus() {
			return deliveryStatus;
		}

		public void setDeliveryStatus(String deliveryStatus) {
			this.deliveryStatus = deliveryStatus;
		}

		public Client getCustomer() {
			return customer;
		}

		public void setCustomer(Client customer) {
			this.customer = customer;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public HashMap<Integer, Integer> getListeAchat() {
			return listeAchat;
		}

		public void setListeAchat(HashMap<Integer, Integer> listeAchat) {
			this.listeAchat = listeAchat;
		}
}