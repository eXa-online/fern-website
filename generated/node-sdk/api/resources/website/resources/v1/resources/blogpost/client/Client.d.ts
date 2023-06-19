/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as core from "../../../../../../../../core";
import * as EXaOnlineGmbHFernWebsite from "../../../../../../..";
export declare namespace Blogpost {
    interface Options {
        environment: core.Supplier<string>;
        username?: core.Supplier<string | undefined>;
        password?: core.Supplier<string | undefined>;
    }
}
export declare class Blogpost {
    protected readonly options: Blogpost.Options;
    constructor(options: Blogpost.Options);
    /**
     * Retrieve all blogposts from the content store
     * @throws {@link EXaOnlineGmbHFernWebsite.NotFoundError}
     * @throws {@link EXaOnlineGmbHFernWebsite.BadRequestError}
     */
    getBlogposts(): Promise<EXaOnlineGmbHFernWebsite.fixtures.BlogPostCollection>;
    /**
     * Retrieve a blog post from the content store based on its slug
     * @throws {@link EXaOnlineGmbHFernWebsite.website.v1.BlogPostDoesNotExistError}
     * @throws {@link EXaOnlineGmbHFernWebsite.NotFoundError}
     * @throws {@link EXaOnlineGmbHFernWebsite.BadRequestError}
     */
    getBlogPost(slug: EXaOnlineGmbHFernWebsite.fixtures.BlogPostSlug): Promise<EXaOnlineGmbHFernWebsite.fixtures.BlogPost>;
    /**
     * Add a new blogpost to the content store
     * @throws {@link EXaOnlineGmbHFernWebsite.NotFoundError}
     * @throws {@link EXaOnlineGmbHFernWebsite.BadRequestError}
     */
    createBlogPost(request: EXaOnlineGmbHFernWebsite.fixtures.CreateBlogPostRequest): Promise<EXaOnlineGmbHFernWebsite.fixtures.BlogPostSlug>;
    protected _getAuthorizationHeader(): Promise<string | undefined>;
}