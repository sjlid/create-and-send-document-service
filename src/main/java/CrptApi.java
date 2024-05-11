import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrptApi {

    private TimeUnit timeUnit;
    private int requestLimit;
    private final String CREATE_URL = "https://ismp.crpt.ru/api/v3/lk/documents/create";

    @SneakyThrows
    public void createDocument(Doc document, String signature) {
        String documentToSend = JSONCreator.convertToString(document);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(CREATE_URL))
                .header("content-type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(documentToSend))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    }


    /**
     * Конвертер из объекта
     */
    class JSONCreator {
        static ObjectMapper objectMapper = new ObjectMapper();

        @SneakyThrows
        public static String convertToString(Doc document) {
            return objectMapper.writeValueAsString(document);
        }
    }

    /**
     * Шаблон объекта для json
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
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

        public Doc withDescription(Description description) {
            this.description = description;
            return this;
        }

        public Doc withDocId(String docId) {
            this.docId = docId;
            return this;
        }

        public Doc withDocStatus(String docStatus) {
            this.docStatus = docStatus;
            return this;
        }

        public Doc withDocType(String docType) {
            this.docType = docType;
            return this;
        }

        public Doc withImportRequest(Boolean importRequest) {
            this.importRequest = importRequest;
            return this;
        }

        public Doc withOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
            return this;
        }

        public Doc withParticipantInn(String participantInn) {
            this.participantInn = participantInn;
            return this;
        }

        public Doc withProducerInn(String producerInn) {
            this.producerInn = producerInn;
            return this;
        }

        public Doc withProductionDate(String productionDate) {
            this.productionDate = productionDate;
            return this;
        }

        public Doc withProductionType(String productionType) {
            this.productionType = productionType;
            return this;
        }

        public Doc withProducts(List<Product> products) {
            this.products = products;
            return this;
        }

        public Doc withRegDate(String regDate) {
            this.regDate = regDate;
            return this;
        }

        public Doc withRegNumber(String regNumber) {
            this.regNumber = regNumber;
            return this;
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
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

        public Product withCertificateDocument(String certificateDocument) {
            this.certificateDocument = certificateDocument;
            return this;
        }

        public Product withCertificateDocumentDate(String certificateDocumentDate) {
            this.certificateDocumentDate = certificateDocumentDate;
            return this;
        }

        public Product withCertificateDocumentNumber(String certificateDocumentNumber) {
            this.certificateDocumentNumber = certificateDocumentNumber;
            return this;
        }

        public Product withOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
            return this;
        }

        public Product withProducerInn(String producerInn) {
            this.producerInn = producerInn;
            return this;
        }

        public Product withProductionDate(String productionDate) {
            this.productionDate = productionDate;
            return this;
        }

        public Product withTnvedCode(String tnvedCode) {
            this.tnvedCode = tnvedCode;
            return this;
        }

        public Product withUitCode(String uitCode) {
            this.uitCode = uitCode;
            return this;
        }

        public Product withUituCode(String uituCode) {
            this.uituCode = uituCode;
            return this;
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    class Description {

        private String participantInn;

        public Description withParticipantInn(String participantInn) {
            this.participantInn = participantInn;
            return this;
        }
    }
}
