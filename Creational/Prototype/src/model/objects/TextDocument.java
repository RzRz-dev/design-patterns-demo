package model.objects;

import model.interfaces.DocumentPrototype;

public class TextDocument implements DocumentPrototype{
    String title;
    String content;
    String font;
    int fontSize;

    public TextDocument(String title, String content, String font, int fontSize) {
        this.title = title;
        this.content = content;
        this.font = font;
        this.fontSize = fontSize;
    }

    @Override
    public DocumentPrototype cloneDoc() {
        return new TextDocument(title, content, font, fontSize);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextDocument{");
        sb.append("title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", font=").append(font);
        sb.append(", fontSize=").append(fontSize);
        sb.append('}');
        return sb.toString();
    }


}
