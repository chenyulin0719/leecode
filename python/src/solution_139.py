class Solution(object):
    """Recursive version will overtime"""
    """DP worked, cache every tried result."""

    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        word_set = set(wordDict)
        tried_word_cache = set()

        def dp(s):
            if s in word_set:
                return True
            if s in tried_word_cache:
                return False

            for word in wordDict:
                if s.startswith(word):
                    substr = s[len(word):]
                    if dp(substr):
                        return True
                    else:
                        tried_word_cache.add(substr)
            return False

        return dp(s)
