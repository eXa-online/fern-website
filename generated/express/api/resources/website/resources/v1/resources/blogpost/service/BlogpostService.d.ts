/**
 * This file was auto-generated by Fern from our API Definition.
 */
import { EXaOnlineGmbHFernWebsite } from "../../../../../../../..";
import express from "express";
import * as serializers from "../../../../../../../../serialization";
export interface BlogpostServiceMethods {
    getBlogposts(req: express.Request<never, EXaOnlineGmbHFernWebsite.fixtures.BlogPostCollection, never, never>, res: {
        send: (responseBody: EXaOnlineGmbHFernWebsite.fixtures.BlogPostCollection) => Promise<void>;
        cookie: (cookie: string, value: string, options?: express.CookieOptions) => void;
        locals: any;
    }): void | Promise<void>;
    getBlogPost(req: express.Request<{
        slug: serializers.fixtures.BlogPostSlug.Raw;
    }, EXaOnlineGmbHFernWebsite.fixtures.BlogPost, never, never>, res: {
        send: (responseBody: EXaOnlineGmbHFernWebsite.fixtures.BlogPost) => Promise<void>;
        cookie: (cookie: string, value: string, options?: express.CookieOptions) => void;
        locals: any;
    }): void | Promise<void>;
    createBlogPost(req: express.Request<never, EXaOnlineGmbHFernWebsite.fixtures.BlogPostSlug, EXaOnlineGmbHFernWebsite.fixtures.CreateBlogPostRequest, never>, res: {
        send: (responseBody: EXaOnlineGmbHFernWebsite.fixtures.BlogPostSlug) => Promise<void>;
        cookie: (cookie: string, value: string, options?: express.CookieOptions) => void;
        locals: any;
    }): void | Promise<void>;
}
export declare class BlogpostService {
    private readonly methods;
    private router;
    constructor(methods: BlogpostServiceMethods, middleware?: express.RequestHandler[]);
    addMiddleware(handler: express.RequestHandler): this;
    toRouter(): express.Router;
}