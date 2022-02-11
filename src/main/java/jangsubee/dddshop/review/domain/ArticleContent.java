package jangsubee.dddshop.review.domain;

import javax.persistence.Embeddable;

@Embeddable
public class ArticleContent {

    private String content;
    private String contentType;
}
