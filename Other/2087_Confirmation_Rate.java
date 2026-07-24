/*
 * Problem: #2087 - Confirmation Rate
 * Difficulty: Medium
 * Topic: database
 * Runtime: 928 ms
 * Memory: 0B
 * Date: 24 Jul 2026
 * LeetCode: https://leetcode.com/problems/confirmation-rate/
 */

select s.user_id, round(avg(if(c.action="confirmed",1,0)),2) as confirmation_rate
from Signups as s left join Confirmations as c on s.user_id= c.user_id group by user_id;