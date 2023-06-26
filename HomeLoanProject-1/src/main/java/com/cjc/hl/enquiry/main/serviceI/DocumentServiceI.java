package com.cjc.hl.enquiry.main.serviceI;

import com.cjc.hl.enquiry.main.model.Document;

public interface DocumentServiceI {
	Document saveDoc(Document pa);

    Iterable<Document> fetchAllDocument();

	Document fetchDocumentById(int custID);
}

