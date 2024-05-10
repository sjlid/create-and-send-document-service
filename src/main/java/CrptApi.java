import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CrptApi {

    private TimeUnit timeUnit;
    private int requestLimit;
    private final String CREATE_URL = "https://ismp.crpt.ru/api/v3/lk/documents/create";

    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
    }


    public void createDocument(Doc document, String signature) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(CREATE_URL))
                .GET()
                .build();
    }


    /**
     * Конвертация json-файлов в джава-класс
     */
    class JSONReader {
        ObjectMapper objectMapper = new ObjectMapper();
        File documentJson = new File("document.json");
        Doc document;

        {
            try {
                document = objectMapper.readValue(documentJson, Doc.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Классы под выходные данные из джейсона
     */
    class Doc {

        private Description description;
        private String docId;
        private String docStatus;
        private String docType;
        private Boolean importRequest;
        private String ownerInn;
        private String participantInn;
        private String producerInn;
        private String productionDate;
        private String productionType;
        private List<Product> products;
        private String regDate;
        private String regNumber;

        public Doc() {
        }

        public Doc(Description description, String docId, String docStatus, String docType, Boolean importRequest, String ownerInn, String participantInn, String producerInn, String productionDate, String productionType, List<Product> products, String regDate, String regNumber) {
            super();
            this.description = description;
            this.docId = docId;
            this.docStatus = docStatus;
            this.docType = docType;
            this.importRequest = importRequest;
            this.ownerInn = ownerInn;
            this.participantInn = participantInn;
            this.producerInn = producerInn;
            this.productionDate = productionDate;
            this.productionType = productionType;
            this.products = products;
            this.regDate = regDate;
            this.regNumber = regNumber;
        }

        public Description getDescription() {
            return description;
        }

        public void setDescription(Description description) {
            this.description = description;
        }

        public Doc withDescription(Description description) {
            this.description = description;
            return this;
        }

        public String getDocId() {
            return docId;
        }

        public void setDocId(String docId) {
            this.docId = docId;
        }

        public Doc withDocId(String docId) {
            this.docId = docId;
            return this;
        }

        public String getDocStatus() {
            return docStatus;
        }

        public void setDocStatus(String docStatus) {
            this.docStatus = docStatus;
        }

        public Doc withDocStatus(String docStatus) {
            this.docStatus = docStatus;
            return this;
        }

        public String getDocType() {
            return docType;
        }

        public void setDocType(String docType) {
            this.docType = docType;
        }

        public Doc withDocType(String docType) {
            this.docType = docType;
            return this;
        }

        public Boolean getImportRequest() {
            return importRequest;
        }

        public void setImportRequest(Boolean importRequest) {
            this.importRequest = importRequest;
        }

        public Doc withImportRequest(Boolean importRequest) {
            this.importRequest = importRequest;
            return this;
        }

        public String getOwnerInn() {
            return ownerInn;
        }

        public void setOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
        }

        public Doc withOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
            return this;
        }

        public String getParticipantInn() {
            return participantInn;
        }

        public void setParticipantInn(String participantInn) {
            this.participantInn = participantInn;
        }

        public Doc withParticipantInn(String participantInn) {
            this.participantInn = participantInn;
            return this;
        }

        public String getProducerInn() {
            return producerInn;
        }

        public void setProducerInn(String producerInn) {
            this.producerInn = producerInn;
        }

        public Doc withProducerInn(String producerInn) {
            this.producerInn = producerInn;
            return this;
        }

        public String getProductionDate() {
            return productionDate;
        }

        public void setProductionDate(String productionDate) {
            this.productionDate = productionDate;
        }

        public Doc withProductionDate(String productionDate) {
            this.productionDate = productionDate;
            return this;
        }

        public String getProductionType() {
            return productionType;
        }

        public void setProductionType(String productionType) {
            this.productionType = productionType;
        }

        public Doc withProductionType(String productionType) {
            this.productionType = productionType;
            return this;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }

        public Doc withProducts(List<Product> products) {
            this.products = products;
            return this;
        }

        public String getRegDate() {
            return regDate;
        }

        public void setRegDate(String regDate) {
            this.regDate = regDate;
        }

        public Doc withRegDate(String regDate) {
            this.regDate = regDate;
            return this;
        }

        public String getRegNumber() {
            return regNumber;
        }

        public void setRegNumber(String regNumber) {
            this.regNumber = regNumber;
        }

        public Doc withRegNumber(String regNumber) {
            this.regNumber = regNumber;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Doc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("description");
            sb.append('=');
            sb.append(((this.description == null)?"<null>":this.description));
            sb.append(',');
            sb.append("docId");
            sb.append('=');
            sb.append(((this.docId == null)?"<null>":this.docId));
            sb.append(',');
            sb.append("docStatus");
            sb.append('=');
            sb.append(((this.docStatus == null)?"<null>":this.docStatus));
            sb.append(',');
            sb.append("docType");
            sb.append('=');
            sb.append(((this.docType == null)?"<null>":this.docType));
            sb.append(',');
            sb.append("importRequest");
            sb.append('=');
            sb.append(((this.importRequest == null)?"<null>":this.importRequest));
            sb.append(',');
            sb.append("ownerInn");
            sb.append('=');
            sb.append(((this.ownerInn == null)?"<null>":this.ownerInn));
            sb.append(',');
            sb.append("participantInn");
            sb.append('=');
            sb.append(((this.participantInn == null)?"<null>":this.participantInn));
            sb.append(',');
            sb.append("producerInn");
            sb.append('=');
            sb.append(((this.producerInn == null)?"<null>":this.producerInn));
            sb.append(',');
            sb.append("productionDate");
            sb.append('=');
            sb.append(((this.productionDate == null)?"<null>":this.productionDate));
            sb.append(',');
            sb.append("productionType");
            sb.append('=');
            sb.append(((this.productionType == null)?"<null>":this.productionType));
            sb.append(',');
            sb.append("products");
            sb.append('=');
            sb.append(((this.products == null)?"<null>":this.products));
            sb.append(',');
            sb.append("regDate");
            sb.append('=');
            sb.append(((this.regDate == null)?"<null>":this.regDate));
            sb.append(',');
            sb.append("regNumber");
            sb.append('=');
            sb.append(((this.regNumber == null)?"<null>":this.regNumber));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }
    }

    class Product {

        private String certificateDocument;
        private String certificateDocumentDate;
        private String certificateDocumentNumber;
        private String ownerInn;
        private String producerInn;
        private String productionDate;
        private String tnvedCode;
        private String uitCode;
        private String uituCode;

        public Product() {
        }

        public Product(String certificateDocument, String certificateDocumentDate, String certificateDocumentNumber, String ownerInn, String producerInn, String productionDate, String tnvedCode, String uitCode, String uituCode) {
            super();
            this.certificateDocument = certificateDocument;
            this.certificateDocumentDate = certificateDocumentDate;
            this.certificateDocumentNumber = certificateDocumentNumber;
            this.ownerInn = ownerInn;
            this.producerInn = producerInn;
            this.productionDate = productionDate;
            this.tnvedCode = tnvedCode;
            this.uitCode = uitCode;
            this.uituCode = uituCode;
        }

        public String getCertificateDocument() {
            return certificateDocument;
        }

        public void setCertificateDocument(String certificateDocument) {
            this.certificateDocument = certificateDocument;
        }

        public Product withCertificateDocument(String certificateDocument) {
            this.certificateDocument = certificateDocument;
            return this;
        }

        public String getCertificateDocumentDate() {
            return certificateDocumentDate;
        }

        public void setCertificateDocumentDate(String certificateDocumentDate) {
            this.certificateDocumentDate = certificateDocumentDate;
        }

        public Product withCertificateDocumentDate(String certificateDocumentDate) {
            this.certificateDocumentDate = certificateDocumentDate;
            return this;
        }

        public String getCertificateDocumentNumber() {
            return certificateDocumentNumber;
        }

        public void setCertificateDocumentNumber(String certificateDocumentNumber) {
            this.certificateDocumentNumber = certificateDocumentNumber;
        }

        public Product withCertificateDocumentNumber(String certificateDocumentNumber) {
            this.certificateDocumentNumber = certificateDocumentNumber;
            return this;
        }

        public String getOwnerInn() {
            return ownerInn;
        }

        public void setOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
        }

        public Product withOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
            return this;
        }

        public String getProducerInn() {
            return producerInn;
        }

        public void setProducerInn(String producerInn) {
            this.producerInn = producerInn;
        }

        public Product withProducerInn(String producerInn) {
            this.producerInn = producerInn;
            return this;
        }

        public String getProductionDate() {
            return productionDate;
        }

        public void setProductionDate(String productionDate) {
            this.productionDate = productionDate;
        }

        public Product withProductionDate(String productionDate) {
            this.productionDate = productionDate;
            return this;
        }

        public String getTnvedCode() {
            return tnvedCode;
        }

        public void setTnvedCode(String tnvedCode) {
            this.tnvedCode = tnvedCode;
        }

        public Product withTnvedCode(String tnvedCode) {
            this.tnvedCode = tnvedCode;
            return this;
        }

        public String getUitCode() {
            return uitCode;
        }

        public void setUitCode(String uitCode) {
            this.uitCode = uitCode;
        }

        public Product withUitCode(String uitCode) {
            this.uitCode = uitCode;
            return this;
        }

        public String getUituCode() {
            return uituCode;
        }

        public void setUituCode(String uituCode) {
            this.uituCode = uituCode;
        }

        public Product withUituCode(String uituCode) {
            this.uituCode = uituCode;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("certificateDocument");
            sb.append('=');
            sb.append(((this.certificateDocument == null)?"<null>":this.certificateDocument));
            sb.append(',');
            sb.append("certificateDocumentDate");
            sb.append('=');
            sb.append(((this.certificateDocumentDate == null)?"<null>":this.certificateDocumentDate));
            sb.append(',');
            sb.append("certificateDocumentNumber");
            sb.append('=');
            sb.append(((this.certificateDocumentNumber == null)?"<null>":this.certificateDocumentNumber));
            sb.append(',');
            sb.append("ownerInn");
            sb.append('=');
            sb.append(((this.ownerInn == null)?"<null>":this.ownerInn));
            sb.append(',');
            sb.append("producerInn");
            sb.append('=');
            sb.append(((this.producerInn == null)?"<null>":this.producerInn));
            sb.append(',');
            sb.append("productionDate");
            sb.append('=');
            sb.append(((this.productionDate == null)?"<null>":this.productionDate));
            sb.append(',');
            sb.append("tnvedCode");
            sb.append('=');
            sb.append(((this.tnvedCode == null)?"<null>":this.tnvedCode));
            sb.append(',');
            sb.append("uitCode");
            sb.append('=');
            sb.append(((this.uitCode == null)?"<null>":this.uitCode));
            sb.append(',');
            sb.append("uituCode");
            sb.append('=');
            sb.append(((this.uituCode == null)?"<null>":this.uituCode));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }
    }

    class Description {

        private String participantInn;

        public Description() {
        }

        public Description(String participantInn) {
            super();
            this.participantInn = participantInn;
        }

        public String getParticipantInn() {
            return participantInn;
        }

        public void setParticipantInn(String participantInn) {
            this.participantInn = participantInn;
        }

        public Description withParticipantInn(String participantInn) {
            this.participantInn = participantInn;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Description.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("participantInn");
            sb.append('=');
            sb.append(((this.participantInn == null)?"<null>":this.participantInn));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }
    }
}
