package de.dren.innihald.server.document;

import de.dren.innihald.server.physicalfile.PhysicalFile;

public class Document {
    private Long id;

    private String title;

    private DocumentType documentType;

    private PhysicalFile file;

    private OcrData content;
}
