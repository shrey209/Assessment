

# Makersharks Assessment

## How to Run

### Using Docker

1. **Pull the Docker Image:**

   ```bash
   docker pull shrey209/assignment
   ```

2. **Run the Docker Container:**

   ```bash
   docker run -p 8080:8080 shrey209/assignment
   ```

3. **Access Swagger UI:**

   **Open your browser and go to:**

   **[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)**

   This will allow you to explore the API and see all available endpoints.

### Using Postman

1. **POST Request:**

   Send a POST request to `http://localhost:8080/api/supplier/query` with the following JSON structure:

   ```json
   {
     "page": 0,
     "size": 1,
     "location": "string",
     "manufacturing_process": "string",
     "nature_of_Business": "string"
   }
   ```

   - **Page:** Defines the page number(Default value is 0).
   - **Size:** Defines the number of records per page(Default value is 100).
   - **Location:** City name.
   - **Manufacturing Process:** Values can be `moulding`, `3d_printing`, `casting`, or `coating`.
   - **Nature of Business:** Values can be `small_scale`, `medium_scale`, or `large_scale`.

2. **Example Search Queries:**

   - **Search by Location:**

     ```json
     {
       "location": "New York"
     }
     ```

   - **Search by Location and Nature of Business:**

     ```json
     {
       "page": 0,
       "location": "New York",
       "nature_of_Business": "Chicago"
     }
     ```

   - **Search by Multiple Fields:**

     ```json
     {
       "page": 0,
       "size": 5,
       "location": "Austin",
       "manufacturing_process": "casting",
       "nature_of_Business": "medium_scale"
     }
     ```

   - **Search by Nature of Business with Pagination:**

     ```json
     {
       "page": 1,
       "size": 10,
       "nature_of_Business": "medium_scale"
     }
     ```

## Running the Application Locally

### Using Eclipse

1. **Clone the Repository:**

   Clone the repository to your local machine:

   ```bash
   git clone https://github.com/shrey209/Assessment.git
   ```

2. **Open the Project in Eclipse:**

   - Open Eclipse.
   - Go to `File` > `Import`.
   - Select `Existing Projects into Workspace` and click `Next`.
   - Click `Browse` and navigate to the `Assessment` folder.
   - Select the folder and click `Finish`.

3. **Run the Application:**

   - Right-click on the project in Eclipse.
   - Select `Run As` > `Java Application`.

### Running the JAR File Directly

1. **Download the JAR File:**

   The JAR file is provided in the repository under the `bin` directory.

2. **Run the JAR File:**

   Use the following command to run the JAR file:

   ```bash
   java -jar path/to/your/assignment.jar
   ```

   Replace `path/to/your/assignment.jar` with the actual path to the JAR file in the `bin` directory.

## API Details

- The API is built using H2 in-memory database and has been seeded with 70 random records for testing.
- The API is versatile and can handle search queries based on any combination of the provided fields.
- Proper exception handling is implemented to ensure smooth operation.

### Example Output

The API returns the content and the number of records (size of content) as shown below:

```json
{
  "content": [
    {
      "supplier_id": 1,
      "company_name": "Alpha Manufacturing",
      "website": "www.alpha.com",
      "location": "New York",
      "manufacturing_process": "moulding",
      "nature_of_Business": "small_scale"
    }
  ],
  "totalNumberOfRecordsInteger": 1
}
```

---
