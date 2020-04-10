/* Code to Create collection, Insert a document in collection and read it */

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

public class InsertCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* connection with server */
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		System.out.println("Server Connected Successfully");
		
		/* connection with Database */
		MongoDatabase database = mongoClient.getDatabase("flights");
		System.out.println("Database Connected Successfully");
		
		/* if this collection not exists; it will get created */
		MongoCollection collection = database.getCollection("dummyData");
		System.out.println("Collection Created Successfully");
		
		/* insert the document in collection */
		Document doc = new Document("fname", "Sumanshu")
	                .append("lname", "Nankana");
		
		collection.insertOne(doc);
		System.out.println("Document Inserted Successfully");
		
		/* read the inserted document*/
		MongoCursor cursor = collection.find().iterator();
		System.out.println(cursor.next());
	}

}