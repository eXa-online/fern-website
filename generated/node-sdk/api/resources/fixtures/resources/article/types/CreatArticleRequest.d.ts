/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as EXaOnlineGmbHFernWebsite from "../../../../..";
export interface CreatArticleRequest {
    slug: EXaOnlineGmbHFernWebsite.fixtures.ArticleSlug;
    title: string;
    image?: string;
    publicationeDate?: Date;
    richtext?: string;
}