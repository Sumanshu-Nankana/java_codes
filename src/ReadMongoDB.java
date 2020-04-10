import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

public class ReadMongoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase database = mongoClient.getDatabase("flights");
		MongoCollection collection = database.getCollection("flightData");
		MongoCursor cursor = collection.find().iterator();
		System.out.println(cursor.next());
	}

}