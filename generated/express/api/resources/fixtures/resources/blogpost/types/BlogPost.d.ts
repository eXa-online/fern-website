/**
 * This file was auto-generated by Fern from our API Definition.
 */
import { ExaOnlineDeFernWebsite } from "../../../../../..";
/**
 * @example
 *     {
 *         slug: "medical-advancements",
 *         title: "Medical Advancements",
 *         author: "Jennifer Lee",
 *         image: "https://img.freepik.com/free-vector/robot-as-doctor-robotized-surgery-with-patient_613284-2477.jpg?w=1380&t=st=1686581395~exp=1686581995~hmac=a9f2469a8d38110c39a0b268c9a01bdea3f709508319d5f2f03c8fea7c0544d4",
 *         publicationeDate: new Date("2023-06-10T16:48:13"),
 *         richtext: "<p>Technology has revolutionized the healthcare industry, leading to numerous medical advancements that have improved patient outcomes. Here are just a few examples:</p> <ul>\n  <li>Robotic Surgery</li>\n    <p>Robotic surgery allows for minimally invasive procedures that are less painful, have a faster recovery time, and reduce the risk of infection. Surgeons are able to perform precise, complex movements with a greater degree of control, leading to better surgical outcomes.</p>\n  <li>Gene Editing</li>\n    <p>Advancements in gene editing and CRISPR technology have opened up a world of possibilities for treating genetic disorders. This technology allows scientists to make precise changes to DNA, potentially eliminating the genetic mutations that cause diseases.</p>\n  <li>Artificial Organs</li>\n    <p>Scientists are working on developing artificial organs that can mimic the function of real ones. These organs could be used to replace damaged or failing organs in patients, potentially saving lives. For example, artificial kidneys could eliminate the need for dialysis in patients with kidney disease.</p>\n  <li>Immunotherapy</li>\n    <p>Immunotherapy is a form of cancer treatment that uses the body's immune system to fight cancer cells. This approach has shown promising results in clinical trials, and has already been used to successfully treat certain types of cancer.</p>\n</ul>   <p>These are just a few of the many medical advancements made possible by technology. As technology continues to advance, we can expect even more breakthroughs in the years to come.</p>\n"
 *     }
 */
export interface BlogPost {
    slug: ExaOnlineDeFernWebsite.fixtures.BlogPostSlug;
    author: string;
    title: string;
    image?: string;
    publicationeDate: Date;
    richtext?: string;
}
