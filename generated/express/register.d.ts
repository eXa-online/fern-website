/**
 * This file was auto-generated by Fern from our API Definition.
 */
import express from "express";
import { ArticleService as website_v1_ArticleService } from "./api/resources/website/resources/v1/resources/article/service/ArticleService";
import { BlogpostService as website_v1_BlogpostService } from "./api/resources/website/resources/v1/resources/blogpost/service/BlogpostService";
export declare function register(expressApp: express.Express | express.Router, services: {
    fixtures: {};
    website: {
        v1: {
            article: website_v1_ArticleService;
            blogpost: website_v1_BlogpostService;
        };
    };
}): void;
