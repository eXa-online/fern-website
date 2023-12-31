/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as core from "../../../../../../../../core";
import * as ExaOnlineDeFernWebsite from "../../../../../../..";
export declare namespace Article {
    interface Options {
        environment: core.Supplier<string>;
        username?: core.Supplier<string | undefined>;
        password?: core.Supplier<string | undefined>;
    }
}
export declare class Article {
    protected readonly options: Article.Options;
    constructor(options: Article.Options);
    /**
     * Retrieve all articles from the content store
     * @throws {@link ExaOnlineDeFernWebsite.NotFoundError}
     * @throws {@link ExaOnlineDeFernWebsite.BadRequestError}
     */
    getArticles(): Promise<ExaOnlineDeFernWebsite.fixtures.ArticleCollection>;
    /**
     * Retrieve an article from the content store based on its slug
     * @throws {@link ExaOnlineDeFernWebsite.website.v1.ArticleDoesNotExistError}
     * @throws {@link ExaOnlineDeFernWebsite.NotFoundError}
     * @throws {@link ExaOnlineDeFernWebsite.BadRequestError}
     */
    getArticle(slug: ExaOnlineDeFernWebsite.fixtures.ArticleSlug): Promise<ExaOnlineDeFernWebsite.fixtures.Article>;
    /**
     * Add a new article to the content store
     * @throws {@link ExaOnlineDeFernWebsite.NotFoundError}
     * @throws {@link ExaOnlineDeFernWebsite.BadRequestError}
     */
    createArticle(request: ExaOnlineDeFernWebsite.fixtures.CreatArticleRequest): Promise<ExaOnlineDeFernWebsite.fixtures.ArticleSlug>;
    protected _getAuthorizationHeader(): Promise<string | undefined>;
}
